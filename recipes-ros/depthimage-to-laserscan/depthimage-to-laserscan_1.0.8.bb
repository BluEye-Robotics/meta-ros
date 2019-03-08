DESCRIPTION = "Converts a depth image to a laser scan for use with navigation and localization."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp sensor-msgs nodelet image-transport image-geometry dynamic-reconfigure ${PYTHON_PN}-rospkg"

SRC_URI = "https://github.com/ros-gbp/depthimage_to_laserscan-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz \
           file://0001-Add-missing-std-namespace-prefixes.patch \
           "
SRC_URI[md5sum] = "6ae1452bffca6c47ed0d822e72296ba7"
SRC_URI[sha256sum] = "dab95189a184d9aa7ea7fd82d26fed581d78dae612c2e81feb31e5b1141ccc58"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RRECOMMENDS_${PN} = "roscpp sensor-msgs nodelet image-transport image-geometry dynamic-reconfigure"
