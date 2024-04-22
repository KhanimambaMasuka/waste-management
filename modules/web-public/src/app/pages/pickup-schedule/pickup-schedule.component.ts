import {Component, OnInit, ViewChild} from '@angular/core';
import {
  MatCell,
  MatColumnDef,
  MatHeaderCell,
  MatHeaderRow,
  MatRow,
  MatTable,
  MatTableDataSource,
  MatTableModule
} from '@angular/material/table';
import {MatPaginator, MatPaginatorModule} from '@angular/material/paginator';
import {CommonModule, DatePipe} from "@angular/common";
import {ScheduleService} from "../../service/schedule.service";
import {MatSort, MatSortModule} from "@angular/material/sort";
import {MatButton} from "@angular/material/button";

@Component({
  selector: 'app-schedule',
  templateUrl: './pickup-schedule.component.html',
  standalone: true,
  imports: [
    MatTable,
    MatTableModule,
    MatHeaderCell,
    MatCell,
    MatHeaderRow,
    MatRow,
    MatPaginator,
    MatPaginatorModule,
    DatePipe,
    MatColumnDef,
    MatSort,
    MatSortModule,
    CommonModule,
    MatButton
  ],
  styleUrls: ['./pickup-schedule.component.css']
})
export class PickupScheduleComponent implements OnInit {
  dataSource!: MatTableDataSource<any>;
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  displayedColumns: string[] = ['id', 'userId', 'pickupDate', 'status'];

  constructor(private scheduleService: ScheduleService) { }

  ngOnInit() {
    this.scheduleService.getSchedule().subscribe((data:any) => {
      this.dataSource = new MatTableDataSource(data.content);
      this.dataSource.paginator = this.paginator;
    });
  }
}
