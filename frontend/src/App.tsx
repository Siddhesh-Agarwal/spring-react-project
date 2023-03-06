import ProjectCard from './Components/ProjectCard'
import { useState, useEffect } from 'react'
import axios from 'axios'

type ProjectData = {
    id: number,
    title: string,
    description: string,
    image: string,
    githubURL: string,
    liveURL: string
}

export default function App() {
    const [projectData, setProjectData] = useState<ProjectData[]>([])

    function getData() {
        axios.get('http://localhost:8080/')
            .then((response) => {
                setProjectData(response.data)
            })
            .catch((error) => {
                console.log(error)
            })
    }

    useEffect(() => {
        getData()
    }, [])

    console.log(projectData)
    return (
        <div className="container mx-auto pt-4 md:pb-12 pb-6 lg:px-16 md:px-12 px-4 bg-gray-100">
            <h1 className="text-4xl font-bold text-center mb-6 underline">
                Projects
            </h1>
            <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
                {
                    projectData.map(
                        (project) => (
                            <ProjectCard props={project} />
                        )
                    )
                }
            </div>
        </div>
    )
}
