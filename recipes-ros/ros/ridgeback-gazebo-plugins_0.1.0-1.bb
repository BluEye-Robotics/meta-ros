DESCRIPTION = "A fork of hector_gazebo_plugins to provide the ros_force_based_move plugin."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp libgazebo9-dev std-msgs std-srvs geometry-msgs nav-msgs tf roscpp gazebo gazebo-ros std-msgs geometry-msgs nav-msgs tf message-runtime"

RDEPENDS_${PN} = "roscpp gazebo gazebo-ros std-msgs geometry-msgs nav-msgs tf message-runtime"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback_simulator-release/archive/release/melodic/ridgeback_gazebo_plugins/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "08d412683534f4a016770602bed182ca"
SRC_URI[sha256sum] = "c6665eb82ca56eb83bbd0f1ffa8b410b4d90e7d6bfb3a92023d7d86265266c87"

ROS_SPN = "ridgeback_simulator"
S = "${WORKDIR}/ridgeback_simulator-release-release-melodic-ridgeback_gazebo_plugins-0.1.0-1"

inherit catkin
