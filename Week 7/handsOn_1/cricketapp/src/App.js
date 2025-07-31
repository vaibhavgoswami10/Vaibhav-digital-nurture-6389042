import React from 'react';
import ListofPlayers from './components/ListOfPlayers.js';
import IndianPlayers from './components/IndianPlayers.js';

function App() {
  const flag = false; 

  return (
    <div className="App">
      <h1> My CrickBuzz</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
