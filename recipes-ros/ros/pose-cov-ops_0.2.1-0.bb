DESCRIPTION = "C++ library for SE(2/3) pose and 2D/3D point composition operations with uncertainty"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "mrpt1 roscpp geometry-msgs mrpt-bridge"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/pose_cov_ops-release/archive/release/melodic/pose_cov_ops/0.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb682525e7a4027d6639a564071b15ca"
SRC_URI[sha256sum] = "03a6c9edc43d420a3532232fdbd48db4d4bf69acea65d8a5ce153b7f19b6595f"

S = "${WORKDIR}/pose_cov_ops-release-release-melodic-pose_cov_ops-0.2.1-0"

inherit catkin
