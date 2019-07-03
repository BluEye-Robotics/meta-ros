DESCRIPTION = "Controller for a differential drive mobile base."
AUTHOR = "Bence Magyar"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface control-msgs dynamic-reconfigure nav-msgs realtime-tools tf urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/diff_drive_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a680efaa8bbcd256e548d567183c7fa"
SRC_URI[sha256sum] = "bc06277c71ef12ba835e78b38e48a3f39886aaf0a03d779c99689f1ebea02ff0"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-diff_drive_controller-0.15.0-0"

inherit catkin
