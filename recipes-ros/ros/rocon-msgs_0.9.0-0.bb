DESCRIPTION = "Communication types (msgs/srvs/actions) for robotics in concert (aka multimaster)."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "concert-msgs gateway-msgs rocon-app-manager-msgs rocon-interaction-msgs concert-service-msgs rocon-service-pair-msgs rocon-std-msgs rocon-tutorial-msgs scheduler-msgs rocon-device-msgs"

RDEPENDS_${PN} = "concert-msgs gateway-msgs rocon-app-manager-msgs rocon-interaction-msgs concert-service-msgs rocon-service-pair-msgs rocon-std-msgs rocon-tutorial-msgs scheduler-msgs rocon-device-msgs"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/rocon_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "29014f628ed70909310f646964bf4e35"
SRC_URI[sha256sum] = "5eca94dc0ac40d38a417f7e804e77d25f3abb25ceda463b681ad24186a0444c2"

S = "${WORKDIR}/rocon_msgs-release-release-melodic-rocon_msgs-0.9.0-0"

inherit catkin
