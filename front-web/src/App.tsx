import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import './App.css';
import Router from './Router';

function App() {
  return (
    <>
      <Router />
      <ToastContainer />
    </>
  );
}

export default App;
