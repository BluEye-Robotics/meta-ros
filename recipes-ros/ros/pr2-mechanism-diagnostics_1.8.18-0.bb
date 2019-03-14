DESCRIPTION = "The `pr2_mechanism_diagnostics` node subscribes to `mechanism_statistics` and publishes diagnostics data for joints and controllers on `/diagnostics`."
AUTHOR = "Kevin Watts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp urdf diagnostic-updater diagnostic-msgs pr2-mechanism-msgs pr2-mechanism-model angles std-srvs std-msgs rostest roscpp urdf rospy diagnostic-updater diagnostic-msgs pr2-mechanism-msgs pr2-mechanism-model angles std-srvs std-msgs"

RDEPENDS_${PN} = "roscpp urdf rospy diagnostic-updater diagnostic-msgs pr2-mechanism-msgs pr2-mechanism-model angles std-srvs std-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_mechanism_diagnostics/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "907071121d4c2c406e2eab13aeb8663f"
SRC_URI[sha256sum] = "3d6fbbd7282c6a07b6ea340848aa1fb79444832f19224508ed20fab0e73bf98c"

ROS_SPN = "pr2_mechanism"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_mechanism_diagnostics-1.8.18-0"

inherit catkin
