import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Virat', 'Rohit', 'Dhoni', 'Pant', 'Shreyas', 'Hardik'];

 
  const oddTeam = allPlayers.filter((_, i) => i % 2 !== 0);   // 1, 3, 5
  const evenTeam = allPlayers.filter((_, i) => i % 2 === 0);  // 0, 2, 4

 
  const T20players = ['Surya', 'Arshdeep'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((p, index) => <li key={index}>{p}</li>)}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((p, index) => <li key={index}>{p}</li>)}
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((p, index) => <li key={index}>{p}</li>)}
      </ul>
    </div>
  );
};

export default IndianPlayers;
