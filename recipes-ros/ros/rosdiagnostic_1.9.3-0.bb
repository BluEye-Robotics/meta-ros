DESCRIPTION = "Command to print aggregated diagnostic contents to the command line"
AUTHOR = "Guillaume Autran"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy diagnostic-msgs"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/rosdiagnostic/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b440f8c8a4c8d04172d67238b9ffe71b"
SRC_URI[sha256sum] = "1244881acaaeb2251f829e4705bbf88e5d1f99d161d24a4ab99bae9a138b85c5"

ROS_SPN = "diagnostics"
S = "${WORKDIR}/diagnostics-release-release-melodic-rosdiagnostic-1.9.3-0"

inherit catkin
