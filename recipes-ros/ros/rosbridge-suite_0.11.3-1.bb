DESCRIPTION = "Rosbridge provides a JSON API to ROS functionality for non-ROS programs. There are a variety of front ends that interface with rosbridge, including a WebSocket server for web browsers to interact with. Rosbridge_suite is a meta-package containing rosbridge, various front end packages for rosbridge like a WebSocket package, and helper packages."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rosbridge-library rosbridge-server rosapi"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_suite/0.11.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ff423c0f764458a55af2a092d6ee3c5"
SRC_URI[sha256sum] = "2d3f7f7cc800d54dabde409e9f6caf4a9dee6b4901ba5639d060f0c91ea0bcb1"

S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_suite-0.11.3-1"

inherit catkin
