import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUpload as icon } from '@fortawesome/free-solid-svg-icons';

export const UploadButton: React.FC = () => {
  return (
    <button className='uploadBtn'>
      <FontAwesomeIcon icon={icon} id='uploadIcn'/>
    </button>
  );
};

export default UploadButton;
