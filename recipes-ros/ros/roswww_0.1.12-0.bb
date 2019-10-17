DESCRIPTION = "Feathery lightweight web server for ROS, that is based on"
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-catkin-pkg rosbridge-server rosbridge-server rosgraph rospack"

RDEPENDS_${PN} = "rosbridge-server rosbridge-server rosgraph rospack"

SRC_URI = "https://github.com/ros-gbp/roswww-release/archive/release/melodic/roswww/0.1.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6c12edaf325f62a7cc7ebd2e9fa6dfa9"
SRC_URI[sha256sum] = "108f7156256acfd659a62d57362a1b92e59114962829148cd451b032d450d3f7"

S = "${WORKDIR}/roswww-release-release-melodic-roswww-0.1.12-0"

inherit catkin
