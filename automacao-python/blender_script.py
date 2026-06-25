import bpy

bpy.ops.object.select_all(action='SELECT')
bpy.ops.object.delete(use_global=False)
bpy.ops.object.text_add(enter_editmode=False, align='WORLD', location=(0, 0, 0), scale=(1, 1, 1))
bpy.ops.object.editmode_toggle()
bpy.ops.font.delete(type='PREVIOUS_OR_SELECTION')
bpy.ops.font.delete(type='PREVIOUS_OR_SELECTION')
bpy.ops.font.delete(type='PREVIOUS_OR_SELECTION')
bpy.ops.font.delete(type='PREVIOUS_OR_SELECTION')
bpy.ops.object.editmode_toggle()
