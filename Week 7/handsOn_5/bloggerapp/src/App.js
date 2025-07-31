import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

const App = () => {
  const [view, setView] = useState("book");
  const items = ["React", "JavaScript", "Node"];

  // switch-case example
  const renderComponent = () => {
    switch(view) {
      case 'book':
        return <BookDetails />;
      case 'blog':
        return <BlogDetails />;
      case 'course':
        return <CourseDetails />;
      default:
        return null;
    }
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Blogger App</h1>

      <div>
        <button onClick={() => setView('book')}>Show Book</button>
        <button onClick={() => setView('blog')}>Show Blog</button>
        <button onClick={() => setView('course')}>Show Course</button>
        <button onClick={() => setView('none')}>Clear</button>
      </div>

      <hr />

      {/* 1. if/else rendering */}
      {view === "book" && <p>Viewing Book Details</p>}

      {/* 2. ternary operator */}
      <p>
        {view === "blog"
          ? "You're viewing a blog"
          : view === "course"
          ? "You're viewing a course"
          : "Choose something to display"}
      </p>

      {/* 3. switch-case rendering */}
      {renderComponent()}

      <hr />

      {/* 4. map() rendering with keys */}
      <h3>Tech Tags:</h3>
      <ul>
        {items.map((item, index) => (
          <li key={index}>#{item}</li>
        ))}
      </ul>
    </div>
  );
};

export default App;
