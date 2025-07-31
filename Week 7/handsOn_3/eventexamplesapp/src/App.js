import React, { useState } from 'react';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(prevCount => prevCount + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prevCount => prevCount - 1);
  };

  const sayHello = () => {
    console.log("Hello! This is a static message.");
  };

  const sayMessage = (message) => {
    alert(message);
  };

  const handleSyntheticEvent = (event) => {
    event.preventDefault();
    alert("I was clicked");
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Event Handling Examples</h1>
      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <div style={{ marginTop: '20px' }}>
        <button onClick={() => sayMessage("Welcome")}>Say Welcome</button>
      </div>

      <div style={{ marginTop: '20px' }}>
        <button onClick={handleSyntheticEvent}>Click Me </button>
      </div>

      <div style={{ marginTop: '40px' }}>
        <CurrencyConvertor />
      </div>
    </div>
  );
}

export default App;
