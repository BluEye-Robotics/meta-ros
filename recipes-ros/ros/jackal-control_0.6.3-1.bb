DESCRIPTION = "Controllers for Jackal"
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch controller-manager interactive-marker-twist-server diff-drive-controller joint-state-controller joy robot-localization teleop-twist-joy topic-tools twist-mux"

RDEPENDS_${PN} = "controller-manager interactive-marker-twist-server diff-drive-controller joint-state-controller joy robot-localization teleop-twist-joy topic-tools twist-mux"

SRC_URI = "https://github.com/clearpath-gbp/jackal-release/archive/release/melodic/jackal_control/0.6.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8c7c679bc9712aae699aed3243018fff"
SRC_URI[sha256sum] = "1a95bcfbb422b9109be66ef8b0109797bedd3e665f37985c9b63f8aa3e92b793"

ROS_SPN = "jackal"
S = "${WORKDIR}/jackal-release-release-melodic-jackal_control-0.6.3-1"

inherit catkin
