DESCRIPTION = "TRAC-IK is a faster, significantly more reliable drop-in replacement for KDL's pseudoinverse Jacobian solver. The TRAC-IK library has a very similar API to KDL's IK solver calls, except that the user passes a maximum time instead of a maximum number of search iterations. Additionally, TRAC-IK allows for error tolerances to be set independently for each Cartesian dimension (x,y,z,roll,pitch. yaw)."
AUTHOR = "Patrick Beeson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules libeigen kdl-parser libnlopt-dev pkgconfig roscpp urdf boost kdl-parser libnlopt-dev libnlopt0 roscpp urdf"

RDEPENDS_${PN} = "boost kdl-parser libnlopt-dev libnlopt0 roscpp urdf"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_lib/1.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c29de93ad99ec4a38b345975f7b47157"
SRC_URI[sha256sum] = "f538a70b479132fa717c5a81ac3d9c8e217daffe1fae8467d9e71f51f28cb39c"

ROS_SPN = "trac_ik"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_lib-1.5.0-1"

inherit catkin
