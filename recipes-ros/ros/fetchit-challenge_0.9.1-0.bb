DESCRIPTION = "The fetchit_challenge package"
AUTHOR = "Miguel Angel Rodriguez"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "effort-controllers gazebo-ros rospy robot-state-publisher controller-manager fetch-gazebo"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetchit_challenge/0.9.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "da0758d982be95ab75be92c44fd4ab0c"
SRC_URI[sha256sum] = "0805738f391830e5c290041438956c70fdfa476e0e18535f3797d904bc0e823f"

ROS_SPN = "fetch_gazebo"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetchit_challenge-0.9.1-0"

inherit catkin
