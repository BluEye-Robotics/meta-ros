DESCRIPTION = "imu_pipeline"
AUTHOR = "Chad Rockey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "imu-processors imu-transformer"

RDEPENDS_${PN} = "imu-processors imu-transformer"

SRC_URI = "https://github.com/ros-gbp/imu_pipeline-release/archive/release/melodic/imu_pipeline/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eb11d64326a2d2d8d9212f9e63c9d089"
SRC_URI[sha256sum] = "9ee5a8bc23b24ed9fc68e57f0a23a27cee64664c6cddd61e6ce6474d2545c3aa"

S = "${WORKDIR}/imu_pipeline-release-release-melodic-imu_pipeline-0.2.3-0"

inherit catkin
