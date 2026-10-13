package com.brandonhunt.loot_tracker_api.dto.loot;

import java.time.Instant;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record LootRequest(
	@NotBlank String source,
	@NotBlank String type,
	@NotNull Instant timestamp,
	@NotEmpty List<@Valid ItemDrop> items) {}