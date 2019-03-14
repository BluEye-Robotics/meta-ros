DESCRIPTION = "Rosbridge provides a JSON API to ROS functionality for non-ROS programs. There are a variety of front ends that interface with rosbridge, including a WebSocket server for web browsers to interact with. Rosbridge_suite is a meta-package containing rosbridge, various front end packages for rosbridge like a WebSocket package, and helper packages."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rosbridge-library rosbridge-server rosapi"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_suite/0.10.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f606f34ae59b2802f18eab055d0db5f6"
SRC_URI[sha256sum] = "8d7bcc84b614bc55cf4eb15768b1f51c87a3eacdcd6668a30435c1983149cb87"

S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_suite-0.10.2-0"

inherit catkin
