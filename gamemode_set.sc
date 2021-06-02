__on_start() -> for(player('all'),
    if(query(_, 'player_type') != 'fake',
        modify(_, 'gamemode', 3)))
