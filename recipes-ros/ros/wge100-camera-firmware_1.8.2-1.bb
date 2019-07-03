DESCRIPTION = "Source for the WGE100 Ethernet camera: Verilog source for the FPGA, Forth source for the camera firmware. Intended for camera developers. Note that a built binary from this package is checked in under wge100_camera/firmware_images/"
AUTHOR = "James Bowman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy gforth gforth rospy"

RDEPENDS_${PN} = "gforth rospy"

SRC_URI = "https://github.com/ros-drivers-gbp/wge100_driver-release/archive/release/melodic/wge100_camera_firmware/1.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6c55238e0b26506f44a7e44f1f579fd5"
SRC_URI[sha256sum] = "4e0908e101472e4247b1c23782764c9576b37103db122bd196de406e9e951e50"

ROS_SPN = "wge100_driver"
S = "${WORKDIR}/wge100_driver-release-release-melodic-wge100_camera_firmware-1.8.2-1"

inherit catkin
