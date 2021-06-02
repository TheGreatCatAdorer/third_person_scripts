__config() -> {'scope' -> 'global'};
__command() -> 'Use the command "third_person player_summon" to summon a fake player to control.';
player_summon() -> then(
fake_players = 0,
for(player('all'),
    if(query(_, 'player_type') == 'fake',
        fake_players += 1)),
fake_player_cap = (length(player('all'))-fake_players)*4,
// The '4' in the above line is a subsitute for the number of fake players per real player.
if(fake_players < fake_player_cap,
    run('player ' + str(floor(rand(2147483648))) +' spawn')),
for(player('all'),
    if(query(_, 'player_type') == 'fake',
        modify(_, 'gamemode', 0))))
