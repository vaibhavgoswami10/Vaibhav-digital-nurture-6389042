
import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);
  const conversionRate = 0.011; 

  const handleChange = (e) => {
    setRupees(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const inr = parseFloat(rupees);
    if (!isNaN(inr)) {
      setEuros((inr * conversionRate).toFixed(2));
    } else {
      setEuros(null);
      alert('Please enter a valid number');
    }
  };

  return (
    <div>
      <h2>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          value={rupees}
          onChange={handleChange}
          placeholder="Enter amount in INR"
        />
        <button type="submit">Convert</button>
      </form>
      {euros !== null && <p>{rupees} INR = €{euros}</p>}
    </div>
  );
}

export default CurrencyConvertor;
