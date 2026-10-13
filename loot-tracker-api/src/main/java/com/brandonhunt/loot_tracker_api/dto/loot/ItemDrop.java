package com.brandonhunt.loot_tracker_api.dto.loot;

import jakarta.validation.constraints.Positive;

public record ItemDrop(int itemId, @Positive int quantity)
	{}
