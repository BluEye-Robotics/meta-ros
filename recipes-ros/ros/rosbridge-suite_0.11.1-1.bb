DESCRIPTION = "Rosbridge provides a JSON API to ROS functionality for non-ROS programs. There are a variety of front ends that interface with rosbridge, including a WebSocket server for web browsers to interact with. Rosbridge_suite is a meta-package containing rosbridge, various front end packages for rosbridge like a WebSocket package, and helper packages."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rosbridge-library rosbridge-server rosapi"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_suite/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "96f1856b62bfd5b5ca4f5673b5ef7aa4"
SRC_URI[sha256sum] = "ced1b1c21c63a7e9da822d6f92cf64e72b3fa87e71464326c06dbd7e6c2624a3"

S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_suite-0.11.1-1"

inherit catkin
