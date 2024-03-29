import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TasksActiveComponent } from './tasks-active.component';

describe('TasksActiveComponent', () => {
  let component: TasksActiveComponent;
  let fixture: ComponentFixture<TasksActiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TasksActiveComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TasksActiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
