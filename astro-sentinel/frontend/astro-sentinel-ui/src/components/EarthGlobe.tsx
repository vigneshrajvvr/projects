import { useRef } from "react"
import { Mesh, SphereGeometry } from "three"

function EarthGloble() {
    const meshRef = useRef<Mesh>(null)
    return (
        <>
            <mesh ref={meshRef}>
                <sphereGeometry args={[2, 64, 64]} />
            </mesh>
        </>
    )
}

export default EarthGloble