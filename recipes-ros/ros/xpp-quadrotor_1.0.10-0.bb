DESCRIPTION = "The URDF file for a quadrotor to be used with the xpp packages and a simple rviz publisher of quadrotor tfs. Adapted from Daniel Mellinger, Nathan Michael, Vijay Kumar, "Trajectory Generation and Control for Precise Aggressive Maneuvers with Quadrotors"."
AUTHOR = "Diego Pardo."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "xacro roscpp xpp-vis"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_quadrotor/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7af353198cc7820d77a81093fee36cde"
SRC_URI[sha256sum] = "8a3c7cbaa6def3250bf3825790f587b3626799b51dc7105917c20af6b8f5d3b4"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_quadrotor-1.0.10-0"

inherit catkin
