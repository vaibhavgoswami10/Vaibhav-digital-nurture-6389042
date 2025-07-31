import React from 'react';
import localOfficeImage from './assets/office.jpg'; // Import local image

function App() {
 
  const office = {
    name: 'Workspace One',
    rent: 55000,
    address: '123, Main Street, Mumbai',
    image: localOfficeImage
  };

  
  const officeList = [
    {
      name: 'Workspace Alpha',
      rent: 50000,
      address: 'Plot 21, Pune',
      image: 'https://via.placeholder.com/300x200?text=Alpha'
    },
    {
      name: 'Startup Hub',
      rent: 70000,
      address: 'Sector 18, Bengaluru',
      image: 'https://via.placeholder.com/300x200?text=Startup+Hub'
    },
    {
      name: 'Corporate Tower',
      rent: 85000,
      address: 'DLF Phase 3, Gurugram',
      image: 'https://via.placeholder.com/300x200?text=Corporate+Tower'
    }
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1> Office Space Rental App</h1>

      <div style={{ border: '1px solid gray', padding: '10px', marginBottom: '20px' }}>
        <h2>{office.name}</h2>
        <img
          src={office.image}
          alt="Office Space"
          style={{ width: '300px', height: '200px', objectFit: 'cover' }}
        />
        <p><strong>Address:</strong> {office.address}</p>
        <p>
          <strong>Rent:</strong>{' '}
          <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            ₹{office.rent}
          </span>
        </p>
      </div>

     
      <h2> Available Office Spaces</h2>
      <div>
        {officeList.map((o, index) => (
          <div key={index} style={{ border: '1px solid lightgray', padding: '10px', marginBottom: '15px' }}>
            <h3>{o.name}</h3>
            <img
              src={o.image}
              alt={o.name}
              style={{ width: '300px', height: '200px', objectFit: 'cover' }}
            />
            <p><strong>Address:</strong> {o.address}</p>
            <p>
              <strong>Rent:</strong>{' '}
              <span style={{ color: o.rent < 60000 ? 'red' : 'green' }}>
                ₹{o.rent}
              </span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
