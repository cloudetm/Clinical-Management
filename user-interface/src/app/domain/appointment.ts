import {Status} from "./status";

export class Appointment {
    public id: string;
    public doctorEmail: string;
    public patientId: string;
    public startDate: Date;
    public endDate: Date;
    public remark: String;
    public recommendation: String;
    public reason: String;
    public description: String;
    public status: Status;
}