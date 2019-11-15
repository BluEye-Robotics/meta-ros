DESCRIPTION = "The neonavigation meta-package including 3-dof configuration space planner"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "costmap-cspace joystick-interrupt map-organizer neonavigation-common neonavigation-launch obj-to-pointcloud planner-cspace safety-limiter track-odometry trajectory-tracker"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb65716462512917822a83634519d98d"
SRC_URI[sha256sum] = "9aafd93b7493d0d42c9d60333bbd59c16cd43bf0a699e6b804de955c200e6f30"

S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation-0.5.0-1"

inherit catkin
