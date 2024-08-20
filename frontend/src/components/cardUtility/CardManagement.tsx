// Handles connection with backend to store color card states

import { ColorCard } from '../colorCard/colorCard'

// POST request to send data to the backend
export async function uploadCardData(card: ColorCard[]) {
    try {
        const response = await fetch('http://localhost:8080/upload', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(card)
        });
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        const result = await response.json();
        console.log(result);
        return result;
    } catch (error) {
        console.error('Error uploading card data:', error);
    }
}
  