DESCRIPTION = "The URDF file for a quadrotor to be used with the xpp packages and a simple rviz publisher of quadrotor tfs. Adapted from Daniel Mellinger, Nathan Michael, Vijay Kumar, "Trajectory Generation and Control for Precise Aggressive Maneuvers with Quadrotors"."
AUTHOR = "Diego Pardo."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp xpp-vis"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_quadrotor/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f28f9c587541df71de0506387bf8eb97"
SRC_URI[sha256sum] = "bf8d27c1805c0b68de3e187193033742d9bbfbd5eec1e417d087016293dd4b32"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_quadrotor-1.0.9-0"

inherit catkin
