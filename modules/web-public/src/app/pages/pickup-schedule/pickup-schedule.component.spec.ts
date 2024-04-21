import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PickupScheduleComponent } from './pickup-schedule.component';

describe('PickupScheduleComponent', () => {
  let component: PickupScheduleComponent;
  let fixture: ComponentFixture<PickupScheduleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PickupScheduleComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PickupScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
