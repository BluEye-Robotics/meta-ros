DESCRIPTION = "This metapackage depends on packages for interfacing common joysticks and human input devices with ROS."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "joy ps3joy spacenav-node wiimote"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/joystick_drivers/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ebcadd334b515bc595fa29a251258e57"
SRC_URI[sha256sum] = "bfa46ae2ec0edaf6d3bb8d0876da64c78f295047cd7d60a40ace164bdcd6fdeb"

S = "${WORKDIR}/joystick_drivers-release-release-melodic-joystick_drivers-1.12.0-0"

inherit catkin
