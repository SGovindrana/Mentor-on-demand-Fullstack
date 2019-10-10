import { User } from "./user.model";
import { Payment } from "./payment.model";
import { Technology } from "./technology.model";
import { Skill } from "./skill.model";
import { Mentor } from "./mentor.model";

export class Training{
    id: string;
    status: string;
    progress: number;
    fees: string;
    commissionAmount: number;
    rating: number;
    startDate: string;
    endDate: string;
    startTime: string;
    endTime: string;
    amountReceived: number;
    userId: number;
    mentorId: number;
    skillId: number;
    amountToMentor: number;
    mentor: Mentor;
    //users: User[];
    skills: Skill[];
    payment: Payment[];
    technology: Technology;

}