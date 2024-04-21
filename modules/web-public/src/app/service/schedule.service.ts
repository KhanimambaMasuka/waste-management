import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {BASE_URL} from "../constants";

@Injectable({
  providedIn: 'root'
})
export class ScheduleService {
  private apiUrl = `${BASE_URL}/schedule`;

  constructor(private http: HttpClient) { }

  getSchedule() {
    return this.http.get(this.apiUrl);
  }
}
