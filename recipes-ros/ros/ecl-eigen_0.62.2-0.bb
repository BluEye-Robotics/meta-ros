DESCRIPTION = "This provides an Eigen implementation for ecl's linear algebra."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules ecl-license libeigen ecl-license libeigen"

RDEPENDS_${PN} = "ecl-license libeigen"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_eigen/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d02baa2626c94bea7067d776aad46180"
SRC_URI[sha256sum] = "e876bba5caea9487942c43d124404890361df1004126e7233a29d6b5c6e1c0c7"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_eigen-0.62.2-0"

inherit catkin
