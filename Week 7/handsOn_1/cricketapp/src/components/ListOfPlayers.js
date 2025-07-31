import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 90 },
    { name: 'Rohit', score: 85 },
    { name: 'Dhoni', score: 75 },
    { name: 'Pant', score: 65 },
    { name: 'Shreyas', score: 60 },
    { name: 'Hardik', score: 80 },
    { name: 'Bumrah', score: 55 },
    { name: 'Siraj', score: 50 },
    { name: 'Ashwin', score: 78 },
    { name: 'Shami', score: 40 },
    { name: 'KL Rahul', score: 88 }
  ];

  
  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with score below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
