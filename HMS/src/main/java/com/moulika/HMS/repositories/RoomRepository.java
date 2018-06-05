package com.moulika.HMS.repositories;
import org.springframework.data.repository.CrudRepository;

import com.moulika.HMS.models.Room;

public interface RoomRepository extends CrudRepository<Room , Integer>, RoomRepositoryCustom{
}