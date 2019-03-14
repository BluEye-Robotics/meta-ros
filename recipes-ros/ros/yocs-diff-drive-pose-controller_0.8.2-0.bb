DESCRIPTION = "A controller for driving a differential drive base to a pose goal or along a path specified by multiple poses. A pose consists of a 2D position (x,y) and a 1D orientation (theta)."
AUTHOR = "Marcus Liebhardt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs tf yocs-controllers yocs-math-toolkit ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs tf yocs-controllers yocs-math-toolkit"

RDEPENDS_${PN} = "ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs tf yocs-controllers yocs-math-toolkit"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_diff_drive_pose_controller/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "be3dc89d1b5117429cf5ae6d40cfe4b7"
SRC_URI[sha256sum] = "fbe23c95911cfbb840e28142bf91da168207ff3cde4ef61f703674672c2e5431"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_diff_drive_pose_controller-0.8.2-0"

inherit catkin
