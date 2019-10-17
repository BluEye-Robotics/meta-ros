DESCRIPTION = "The rc_visard_driver provides data from a Roboception rc_visard 3D sensor on several ROS topics."
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "protobuf-dev message-generation curl rc-genicam-api rc-dynamics-api nodelet roscpp std-srvs sensor-msgs stereo-msgs image-transport dynamic-reconfigure geometry-msgs tf visualization-msgs nav-msgs diagnostic-updater"

RDEPENDS_${PN} = "protobuf message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard_driver/2.6.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1c91a369080a6666f10a1acec655e7af"
SRC_URI[sha256sum] = "4153572b59c1a6c6c55f1cb02465f2bda4bfc2ca47654f2b5bceb44093200a38"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard_driver-2.6.4-1"

inherit catkin
