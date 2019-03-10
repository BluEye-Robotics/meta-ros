DESCRIPTION = "Controller for a differential drive mobile base."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles controller-interface nav-msgs realtime-tools tf urdf dynamic-reconfigure ${PYTHON_PN}-rospkg"

require ros-controllers.inc

SRC_URI += "file://0001-Remove-SYSTEM-from-cmake-include-directories.patch;striplevel=2"
