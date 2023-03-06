import { FaGithub, FaGlobe } from 'react-icons/fa'

type ProjectData = {
    id: number,
    title: string,
    description: string,
    image: string,
    githubURL: string,
    liveURL: string
}

export default function ProjectCard({ props }: { props: ProjectData }) {
    // Use TailwindCSS to style the project card
    return (
        <div
            className="bg-white shadow-md rounded-lg overflow-hidden border border-gray-200 hover:shadow-xl"
            id={`project-${props.id}`}
        >
            {/* Image */}
            <img
                src={props.image}
                alt={props.title}
                className="w-full h-48 object-cover"
            />
            <div className='px-3 py-4'>
                {/* Title */}
                <div className="mt-2">
                    <h1 className="text-gray-900 font-bold text-2xl tracking-wide">{props.title}</h1>
                </div>
                {/* Description */}
                <p className="flex flex-wrap mt-4 text-gray-700">
                    {props.description}
                </p>
                {/* Links */}
                <div className="flex flex-wrap mt-2">
                    <a
                        href={props.githubURL}
                        target="_blank"
                        rel="noreferrer noopener"
                        className="bg-gray-900 text-white rounded-sm text-sm m-1 py-1 px-2"
                    >
                        <FaGithub className="inline-block mr-1" /> GitHub
                    </a>
                    <a
                        href={props.liveURL}
                        target="_blank"
                        rel="noreferrer noopener"
                        className="bg-green-700 text-white rounded-sm text-sm m-1 py-1 px-2"
                    >
                        <FaGlobe className="inline-block mr-1" /> Live
                    </a>
                </div>
            </div>
        </div>
    )
}

// Path: src\Components\ProjectCard.ts\