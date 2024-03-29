import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TasksInactiveComponent } from './tasks-inactive.component';

describe('TasksInactiveComponent', () => {
  let component: TasksInactiveComponent;
  let fixture: ComponentFixture<TasksInactiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TasksInactiveComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TasksInactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
