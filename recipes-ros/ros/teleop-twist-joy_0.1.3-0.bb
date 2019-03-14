DESCRIPTION = "Generic joystick teleop for twist robots."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs joy roscpp roslaunch roslint rostest sensor-msgs geometry-msgs joy roscpp sensor-msgs"

RDEPENDS_${PN} = "geometry-msgs joy roscpp sensor-msgs"

SRC_URI = "https://github.com/ros-teleop/teleop_twist_joy-release/archive/release/melodic/teleop_twist_joy/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec6dd150973ca911b5f06ccba9abe0a4"
SRC_URI[sha256sum] = "3e9186dd642c84cc2776994b6afa7a97a9a4759d53170c1e1f9fddd9fbc789e4"

S = "${WORKDIR}/teleop_twist_joy-release-release-melodic-teleop_twist_joy-0.1.3-0"

inherit catkin
