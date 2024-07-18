import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.tsx'
import Home from './Home'
import Login from './Login'
import { createBrowserRouter, RouterProvider } from 'react-router-dom';

import './scss/style.scss'
import * as bootstrap from 'bootstrap'

const router = createBrowserRouter([
  {
    path: "/",
    element: <App/>
  }, {
    path: "/authorized",
    element: <Home/>
  }, {
    path: "/login",
    element: <Login/>
  }
]);

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <div className="container mt-5">
      <RouterProvider router={router} />
    </div>
  </React.StrictMode>
)
