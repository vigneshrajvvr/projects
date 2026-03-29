import './App.css'
import { Canvas } from '@react-three/fiber'
import EarthGlobe from './components/EarthGlobe'

function App() {
  return (
    <Canvas>
      <EarthGlobe />
    </Canvas>
  )
}

export default App
