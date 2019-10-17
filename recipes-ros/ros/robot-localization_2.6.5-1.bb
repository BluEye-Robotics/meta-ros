DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number of sensors."
AUTHOR = "Tom Moore"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation python3-catkin-pkg roslint cmake-modules diagnostic-msgs diagnostic-updater libeigen eigen-conversions geographic-msgs geometry-msgs message-filters nav-msgs nodelet roscpp sensor-msgs std-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros xmlrpcpp yaml-cpp"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/cra-ros-pkg/robot_localization-release/archive/release/melodic/robot_localization/2.6.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d483f3804da541b8cd6ac3d794724c7f"
SRC_URI[sha256sum] = "971bcda9b4564009674b21d1a344a14ef6d7458f3156b9110ed36b02d933b189"

S = "${WORKDIR}/robot_localization-release-release-melodic-robot_localization-2.6.5-1"

inherit catkin
